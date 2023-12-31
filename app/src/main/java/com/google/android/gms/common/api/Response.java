package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public class Response<T extends Result> {
    private T zza;

    public Response() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Response(T t10) {
        this.zza = t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getResult() {
        return this.zza;
    }

    public void setResult(T t10) {
        this.zza = t10;
    }
}
