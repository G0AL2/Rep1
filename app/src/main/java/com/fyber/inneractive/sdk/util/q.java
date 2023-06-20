package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;

/* loaded from: classes2.dex */
public class q extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public Context f20318a;

    /* renamed from: b  reason: collision with root package name */
    public a f20319b;

    /* renamed from: c  reason: collision with root package name */
    public String f20320c;

    /* renamed from: d  reason: collision with root package name */
    public String f20321d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f20322e;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public q(Context context, a aVar, String str, String str2, int i10) {
        this.f20318a = context;
        this.f20319b = aVar;
        this.f20320c = str;
        this.f20322e = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9 A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:51:0x00ba, B:53:0x00c9), top: B:75:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3 A[Catch: all -> 0x00dc, DONT_GENERATE, TryCatch #13 {all -> 0x00dc, blocks: (B:55:0x00ce, B:57:0x00d3, B:59:0x00d8), top: B:100:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8 A[Catch: all -> 0x00dc, DONT_GENERATE, TRY_LEAVE, TryCatch #13 {all -> 0x00dc, blocks: (B:55:0x00ce, B:57:0x00d3, B:59:0x00d8), top: B:100:0x00ce }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap doInBackground(java.lang.Void[] r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.q.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        a aVar = this.f20319b;
        if (aVar == null) {
            return;
        }
        if (bitmap2 != null) {
            com.fyber.inneractive.sdk.player.d dVar = (com.fyber.inneractive.sdk.player.d) aVar;
            com.fyber.inneractive.sdk.player.c cVar = dVar.f17945a;
            if (cVar.f17736n != null) {
                cVar.a(bitmap2);
                com.fyber.inneractive.sdk.player.c cVar2 = dVar.f17945a;
                cVar2.f17735m = null;
                cVar2.f17736n = null;
            }
            IAlog.a("MediaPlayerController: fetching video frame success!", new Object[0]);
        } else {
            com.fyber.inneractive.sdk.player.d dVar2 = (com.fyber.inneractive.sdk.player.d) aVar;
            com.fyber.inneractive.sdk.player.c cVar3 = dVar2.f17945a;
            if (cVar3.f17736n != null) {
                cVar3.a((Bitmap) null);
                com.fyber.inneractive.sdk.player.c cVar4 = dVar2.f17945a;
                cVar4.f17735m = null;
                cVar4.f17736n = null;
            }
            IAlog.a("MediaPlayerController: fetching video frame failed!", new Object[0]);
        }
        this.f20319b = null;
    }
}
