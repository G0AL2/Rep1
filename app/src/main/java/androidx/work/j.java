package androidx.work;

/* compiled from: InputMergerFactory.java */
/* loaded from: classes.dex */
public abstract class j {

    /* compiled from: InputMergerFactory.java */
    /* loaded from: classes.dex */
    class a extends j {
        a() {
        }

        @Override // androidx.work.j
        public i a(String str) {
            return null;
        }
    }

    public static j c() {
        return new a();
    }

    public abstract i a(String str);

    public final i b(String str) {
        i a10 = a(str);
        return a10 == null ? i.a(str) : a10;
    }
}
