CRIPTION = "Full qt5 modules image"
LICENSE = "MIT"

require recipes-fsl/images/fsl-image-multimedia-full.bb

PACKAGECONFIG_remove_mx6 = " \
	opencv \
"

IMAGE_INSTALL_remove += " \
	opencv \
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
"
