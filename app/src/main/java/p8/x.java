package p8;

/* compiled from: SeekMap.java */
/* loaded from: classes2.dex */
public interface x {

    /* compiled from: SeekMap.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y f35702a;

        /* renamed from: b  reason: collision with root package name */
        public final y f35703b;

        public a(y yVar) {
            this(yVar, yVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35702a.equals(aVar.f35702a) && this.f35703b.equals(aVar.f35703b);
        }

        public int hashCode() {
            return (this.f35702a.hashCode() * 31) + this.f35703b.hashCode();
        }

        public String toString() {
            String sb2;
            String valueOf = String.valueOf(this.f35702a);
            if (this.f35702a.equals(this.f35703b)) {
                sb2 = "";
            } else {
                String valueOf2 = String.valueOf(this.f35703b);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2);
                sb3.append(", ");
                sb3.append(valueOf2);
                sb2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(valueOf.length() + 2 + String.valueOf(sb2).length());
            sb4.append("[");
            sb4.append(valueOf);
            sb4.append(sb2);
            sb4.append("]");
            return sb4.toString();
        }

        public a(y yVar, y yVar2) {
            this.f35702a = (y) ea.a.e(yVar);
            this.f35703b = (y) ea.a.e(yVar2);
        }
    }

    /* compiled from: SeekMap.java */
    /* loaded from: classes2.dex */
    public static class b implements x {

        /* renamed from: a  reason: collision with root package name */
        private final long f35704a;

        /* renamed from: b  reason: collision with root package name */
        private final a f35705b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // p8.x
        public a d(long j10) {
            return this.f35705b;
        }

        @Override // p8.x
        public boolean f() {
            return false;
        }

        @Override // p8.x
        public long i() {
            return this.f35704a;
        }

        public b(long j10, long j11) {
            this.f35704a = j10;
            this.f35705b = new a(j11 == 0 ? y.f35706c : new y(0L, j11));
        }
    }

    a d(long j10);

    boolean f();

    long i();
}
