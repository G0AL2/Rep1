package o2;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f34947a;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* renamed from: o2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0463a {

        /* renamed from: a  reason: collision with root package name */
        private String f34948a;

        /* synthetic */ C0463a(j jVar) {
        }

        public a a() {
            String str = this.f34948a;
            if (str != null) {
                a aVar = new a(null);
                aVar.f34947a = str;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public C0463a b(String str) {
            this.f34948a = str;
            return this;
        }
    }

    /* synthetic */ a(q qVar) {
    }

    public static C0463a b() {
        return new C0463a(null);
    }

    public String a() {
        return this.f34947a;
    }
}
