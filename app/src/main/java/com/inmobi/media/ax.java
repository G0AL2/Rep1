package com.inmobi.media;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdAssetFetcher.java */
/* loaded from: classes3.dex */
public final class ax {

    /* renamed from: b  reason: collision with root package name */
    private static final String f24657b = "ax";

    /* renamed from: a  reason: collision with root package name */
    bf f24658a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(bf bfVar) {
        this.f24658a = bfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(av avVar, File file, long j10, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ImagesContract.URL, avVar.f24630d);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j10);
            jSONObject.put("download_ended_at", j11);
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
        }
        return jSONObject.toString().replace("\"", "\\\"");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(long j10, long j11, long j12) {
        try {
            iv.a().a(0L);
            iv.a().b(j11);
            iv.a().c(j12 - j10);
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
        }
    }
}
