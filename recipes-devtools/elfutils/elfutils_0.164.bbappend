

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
        file://Fix_one_GCC7_warning.patch \
        file://0001-Add-GCC7-Wimplicit-fallthrough-support-fixes.patch \
        file://0001-ar-Fix-GCC7-Wformat-length-issues.patch \
	file://fallthrough.patch \
"
