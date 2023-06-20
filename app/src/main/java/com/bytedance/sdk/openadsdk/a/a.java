package com.bytedance.sdk.openadsdk.a;

import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.component.utils.l;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: LruDiskFile.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f10640a = Executors.newSingleThreadExecutor();

    /* compiled from: LruDiskFile.java */
    /* renamed from: com.bytedance.sdk.openadsdk.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class CallableC0161a implements Callable<Void> {

        /* renamed from: b  reason: collision with root package name */
        private final File f10642b;

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            a.this.b(this.f10642b);
            return null;
        }

        private CallableC0161a(File file) {
            this.f10642b = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file) throws IOException {
        try {
            f.b(file);
        } catch (Throwable th) {
            l.a("LruDiskFile", "setLastModifiedNowError", th);
        }
        a(f.a(file.getParentFile()));
    }

    protected abstract void a(List<File> list);

    protected abstract boolean a(long j10, int i10);

    protected abstract boolean a(File file, long j10, int i10);

    public void a(File file) throws IOException {
        this.f10640a.submit(new CallableC0161a(file));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b(List<File> list) {
        long j10 = 0;
        for (File file : list) {
            j10 += file.length();
        }
        return j10;
    }
}
