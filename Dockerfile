FROM alpine

ENV PARA_PLUGIN_ID="para-storage-s3" \
	PARA_PLUGIN_VER="1.52.0"

ADD https://repo1.maven.org/maven2/com/erudika/$PARA_PLUGIN_ID/$PARA_PLUGIN_VER/$PARA_PLUGIN_ID-$PARA_PLUGIN_VER-shaded.jar /para/lib/
