package com.vehiclecloud.app.videofetch.rndownloader.media;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTaskBase;
import com.vehiclecloud.app.videofetch.rndownloader.util.FS;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class StreamingParser {
    private StreamingParser() {
    }

    public static void rmFiles(DownloadResource downloadResource) throws IOException {
        FS.deleteRecursive(new File(downloadResource.fileName));
        FS.deleteRecursive(new File(segmentsDir(downloadResource)));
        if (downloadResource.mergedFileName != null) {
            FS.deleteRecursive(new File(downloadResource.mergedFileName));
        }
    }

    public static String segmentsDir(DownloadTaskBase downloadTaskBase) {
        String str = downloadTaskBase.fileName;
        String str2 = File.separator;
        String substring = str.substring(str.lastIndexOf(str2) + 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, str.lastIndexOf(str2) + 1));
        boolean startsWith = substring.startsWith(".");
        sb2.append(substring.substring(startsWith ? 1 : 0, substring.lastIndexOf(".")));
        return sb2.toString();
    }
}
