package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: ImageDownload.java */
/* loaded from: classes3.dex */
public class d0 implements Closeable {

    /* renamed from: a */
    private final URL f23480a;

    /* renamed from: b */
    private volatile Future<?> f23481b;

    /* renamed from: c */
    private Task<Bitmap> f23482c;

    private d0(URL url) {
        this.f23480a = url;
    }

    public static /* synthetic */ void a(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        d0Var.l(taskCompletionSource);
    }

    private byte[] d() throws IOException {
        URLConnection openConnection = this.f23480a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = b.d(b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f23480a);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static d0 e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new d0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public /* synthetic */ void l(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f23480a);
        }
        byte[] d10 = d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(d10, 0, d10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f23480a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f23480a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23481b.cancel(true);
    }

    public Task<Bitmap> h() {
        return (Task) Preconditions.checkNotNull(this.f23482c);
    }

    public void q(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f23481b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.a(d0.this, taskCompletionSource);
            }
        });
        this.f23482c = taskCompletionSource.getTask();
    }
}
