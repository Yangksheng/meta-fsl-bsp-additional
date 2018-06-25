

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
	file://Fix-fallthrough-build-errors.patch \
"
