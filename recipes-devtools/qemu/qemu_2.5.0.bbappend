
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
            file://memfd.patch \
            file://replace-struct-ucontext-with-ucontext_t-type.patch \
"
