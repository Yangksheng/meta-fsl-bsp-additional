CRIPTION = "Full qt5 modules image"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-multimedia-full.bb

PACKAGECONFIG_remove_mx6 = " \
	opencv \
"

IMAGE_INSTALL_remove += " \
	opencv \
"

## Select Image Features
IMAGE_FEATURES += " \
    tools-profile \
    splash \
    ssh-server-dropbear \
    hwcodecs \
"
CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-fsl-tools-audio \
"

QT5_IMAGE_INSTALL_mx6 = " \
	imx-qtapplications \
	packagegroup-qt5-toolchain-target \
	packagegroup-qt5-demos \
	gstreamer1.0-plugins-bad-qt \
	qtmultimedia \
"

IMAGE_INSTALL += " \
	${QT5_IMAGE_INSTALL} \
	udev \
	udev-extraconf \
	fsl-rc-local \
	envset \
"
