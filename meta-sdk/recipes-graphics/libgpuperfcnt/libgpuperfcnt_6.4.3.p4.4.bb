DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI[arm-fb.md5sum] = "25f8de28069c88a264e8991c6f090ddd"
SRC_URI[arm-fb.sha256sum] = "dd586ab5bd1c759b793bb659e7dcd9594432c1ba9366efc6a7b765342db4a3eb"

SRC_URI[arm-wayland.md5sum] = "46d6aeb1a3c7c214e17b0d575e774486"
SRC_URI[arm-wayland.sha256sum] = "65116d7d23a99c7b6910e434e052289cf111f05ebd6aa8def8403837cfc98be4"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "b467d80cf7cfc4e8da55144ca8fe40fe"
SRC_URI[aarch64-wayland.sha256sum] = "b5d16b1a4b080036488e2af2991bca8e847bd6a1346c1ac6c34a6fd0afac315f"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
