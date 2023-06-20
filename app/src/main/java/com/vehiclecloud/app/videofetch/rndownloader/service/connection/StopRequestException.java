package com.vehiclecloud.app.videofetch.rndownloader.service.connection;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* loaded from: classes3.dex */
public class StopRequestException extends RuntimeException {
    private final int mFinalStatus;

    public StopRequestException(int i10, String str) {
        super(str);
        this.mFinalStatus = i10;
    }

    public static StopRequestException throwUnhandledHttpError(int i10, String str) throws StopRequestException {
        String str2 = "Unhandled HTTP response: " + i10 + " " + str;
        if (i10 < 400 || i10 >= 600) {
            if (i10 >= 300 && i10 < 400) {
                throw new StopRequestException((int) DownloadResource.STATUS_UNHANDLED_REDIRECT, str2);
            }
            throw new StopRequestException((int) DownloadResource.STATUS_UNHANDLED_HTTP_CODE, str2);
        }
        throw new StopRequestException(i10, str2);
    }

    public int getFinalStatus() {
        return this.mFinalStatus;
    }

    public StopRequestException(int i10, Throwable th) {
        this(i10, th.getMessage());
        initCause(th);
    }

    public StopRequestException(int i10, String str, Throwable th) {
        this(i10, str);
        initCause(th);
    }
}
