

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/Yangksheng/linux-imx.git;branch=${SRCBRANCH} \
           file://defconfig \
"

MACHINE_USES_VIVANTE_KERNEL_DRIVER_MODULE = "0"
SRCBRANCH = "imx_4.1.15_2.0.0_ga"
LOCALVERSION = "-2.0.0"
SCMVERSION = "-ga"
SRCREV = "${SRCBRANCH}"

PE = "1"
PR = "r0"
