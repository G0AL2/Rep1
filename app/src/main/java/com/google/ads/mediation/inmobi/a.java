package com.google.ads.mediation.inmobi;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ImageDownloaderAsyncTask.java */
/* loaded from: classes2.dex */
class a extends AsyncTask<Object, Void, HashMap<String, Drawable>> {

    /* renamed from: a  reason: collision with root package name */
    private final b f20622a;

    /* renamed from: b  reason: collision with root package name */
    private final e f20623b = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDownloaderAsyncTask.java */
    /* renamed from: com.google.ads.mediation.inmobi.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0279a implements Callable<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ URL f20624a;

        CallableC0279a(a aVar, URL url) {
            this.f20624a = url;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Drawable call() throws Exception {
            Bitmap decodeStream = BitmapFactory.decodeStream(this.f20624a.openStream());
            decodeStream.setDensity(160);
            return new BitmapDrawable(Resources.getSystem(), decodeStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDownloaderAsyncTask.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(HashMap<String, Drawable> hashMap);

        void b();
    }

    public a(b bVar) {
        this.f20622a = bVar;
    }

    private Future<Drawable> b(URL url, ExecutorService executorService) {
        return executorService.submit(new CallableC0279a(this, url));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public HashMap<String, Drawable> doInBackground(Object... objArr) {
        Drawable drawable;
        HashMap hashMap = (HashMap) objArr[0];
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        try {
            if (this.f20623b.b(String.valueOf(hashMap.get("icon_key"))) != null) {
                drawable = this.f20623b.b(String.valueOf(hashMap.get("icon_key")));
            } else {
                Drawable drawable2 = b((URL) hashMap.get("icon_key"), newCachedThreadPool).get(10L, TimeUnit.SECONDS);
                this.f20623b.d(String.valueOf(hashMap.get("icon_key")), drawable2);
                drawable = drawable2;
            }
            HashMap<String, Drawable> hashMap2 = new HashMap<>();
            hashMap2.put("icon_key", drawable);
            return hashMap2;
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(HashMap<String, Drawable> hashMap) {
        super.onPostExecute(hashMap);
        if (hashMap != null) {
            this.f20622a.a(hashMap);
        } else {
            this.f20622a.b();
        }
    }
}
