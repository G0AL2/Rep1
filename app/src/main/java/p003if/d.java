package p003if;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import qe.k;

/* compiled from: AndroidLog.kt */
/* renamed from: if.d  reason: invalid package */
/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f31946a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int b10;
        k.f(logRecord, "record");
        c cVar = c.f31945c;
        String loggerName = logRecord.getLoggerName();
        k.e(loggerName, "record.loggerName");
        b10 = e.b(logRecord);
        String message = logRecord.getMessage();
        k.e(message, "record.message");
        cVar.a(loggerName, b10, message, logRecord.getThrown());
    }
}
