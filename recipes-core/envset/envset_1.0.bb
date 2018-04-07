
DESCRIPTION = "Enviroment set for qt5 in imx6"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39ec502560ab2755c4555ee8416dfe42"

SRC_URI = "file://qt5.sh \
           file://LICENSE \
"

S = "${WORKDIR}"
do_install_append () {
	install -d ${D}${sysconfdir}/profile.d/
	install -m 0644 ${WORKDIR}/qt5.sh ${D}${sysconfdir}/profile.d/
}
