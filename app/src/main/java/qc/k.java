package qc;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes3.dex */
public interface k {

    /* compiled from: HeartBeatInfo.java */
    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f36078a;

        a(int i10) {
            this.f36078a = i10;
        }

        public int f() {
            return this.f36078a;
        }
    }

    a b(String str);
}
