# Copyright 2018-2021,2023 NXP

DESCRIPTION = "i.MX DSP Codec Wrapper and Lib owned by NXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "058bf23079283b63755e3f11f49fae2e"
SRC_URI[sha256sum] = "492d9845f0d08d3623aaed1ac3ac85f47637e8ca53d9a3330bbfb3d3b48dd4a2"

# Fix strip command failed: 'Unable to recognise the format of the input file'
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INSANE_SKIP:${PN} = "arch dev-so ldflags"

EXTRA_OECONF:append:mx8qm-nxp-bsp = " --enable-imx8qmqxp"
EXTRA_OECONF:append:mx8qxp-nxp-bsp = " --enable-imx8qmqxp"
EXTRA_OECONF:append:mx8dx-nxp-bsp = " --enable-imx8qmqxp"
EXTRA_OECONF:append:mx8mp-nxp-bsp = " --enable-imx8m"
EXTRA_OECONF:append:mx8ulp-nxp-bsp = " --enable-imx8ulp"

FILES:${PN} += "${libdir}/imx-mm/audio-codec/dsp ${datadir}/imx-mm"
COMPATIBLE_MACHINE = "(mx8qm-nxp-bsp|mx8qxp-nxp-bsp|mx8dx-nxp-bsp|mx8mp-nxp-bsp|mx8ulp-nxp-bsp)"
