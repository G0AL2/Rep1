package qc;

import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: HeartBeatResult.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class m {
    public static m a(String str, List<String> list) {
        return new a(str, list);
    }

    public abstract List<String> b();

    public abstract String c();
}
