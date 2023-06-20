package androidx.work;

import java.util.List;

/* compiled from: InputMerger.java */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4461a = l.i("InputMerger");

    public static i a(String str) {
        try {
            return (i) Class.forName(str).newInstance();
        } catch (Exception e10) {
            l e11 = l.e();
            String str2 = f4461a;
            e11.d(str2, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
