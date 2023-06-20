package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
final class y extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f3280a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f3281b = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str) {
        this.f3280a = str;
    }

    private void a() {
        if (this.f3281b.length() > 0) {
            Log.d(this.f3280a, this.f3281b.toString());
            StringBuilder sb2 = this.f3281b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f3281b.append(c10);
            }
        }
    }
}
