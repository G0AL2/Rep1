package p003if;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: AndroidLog.kt */
/* renamed from: if.e  reason: invalid package */
/* loaded from: classes3.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
