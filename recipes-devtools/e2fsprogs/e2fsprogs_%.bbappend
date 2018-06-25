
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
            file://0001-misc-rename-copy_file_range-to-copy_file_chunk.patch \
"
