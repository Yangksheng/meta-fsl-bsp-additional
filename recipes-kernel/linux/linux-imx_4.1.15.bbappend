

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/Yangksheng/linux-imx.git;branch=${SRCBRANCH} \
           file://defconfig \
"

LOCALVERSION = "-ga"
