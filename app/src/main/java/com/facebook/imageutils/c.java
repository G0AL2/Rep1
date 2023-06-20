package com.facebook.imageutils;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.io.InputStream;
import y3.k;

/* compiled from: JfifUtil.java */
/* loaded from: classes.dex */
public class c {
    public static int a(int i10) {
        return e.a(i10);
    }

    public static int b(InputStream inputStream) {
        try {
            int d10 = d(inputStream);
            if (d10 == 0) {
                return 0;
            }
            return e.d(inputStream, d10);
        } catch (IOException unused) {
            return 0;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case DownloadResource.STATUS_RUNNING /* 192 */:
            case DownloadResource.STATUS_PAUSED_BY_APP /* 193 */:
            case DownloadResource.STATUS_WAITING_TO_RETRY /* 194 */:
            case DownloadResource.STATUS_WAITING_FOR_NETWORK /* 195 */:
            case 197:
            case DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR /* 198 */:
            case DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR /* 199 */:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case DownloadResource.STATUS_QUEUED_FOR_WIFI /* 196 */:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private static int d(InputStream inputStream) throws IOException {
        int a10;
        if (e(inputStream, 225) && (a10 = d.a(inputStream, 2, false) - 2) > 6) {
            int a11 = d.a(inputStream, 4, false);
            int a12 = d.a(inputStream, 2, false);
            int i10 = (a10 - 4) - 2;
            if (a11 == 1165519206 && a12 == 0) {
                return i10;
            }
        }
        return 0;
    }

    public static boolean e(InputStream inputStream, int i10) throws IOException {
        k.g(inputStream);
        while (d.a(inputStream, 1, false) == 255) {
            int i11 = 255;
            while (i11 == 255) {
                i11 = d.a(inputStream, 1, false);
            }
            if ((i10 != 192 || !c(i11)) && i11 != i10) {
                if (i11 != 216 && i11 != 1) {
                    if (i11 == 217 || i11 == 218) {
                        break;
                    }
                    inputStream.skip(d.a(inputStream, 2, false) - 2);
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
