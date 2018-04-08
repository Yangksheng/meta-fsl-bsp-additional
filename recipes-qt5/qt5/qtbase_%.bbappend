
SRC_URI_remove = " file://fix-eglfs_kms_egldevice-build-error.patch \
                   file://0001-evdevtouch-Avoid-crashing-on-exit.patch \
"

DEPENDS += "gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-bad"
