package ac;

import ac.a0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes3.dex */
final class f extends a0.d.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f381a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* loaded from: classes3.dex */
    public static final class b extends a0.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f383a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f384b;

        @Override // ac.a0.d.b.a
        public a0.d.b a() {
            String str = "";
            if (this.f383a == null) {
                str = " filename";
            }
            if (this.f384b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new f(this.f383a, this.f384b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ac.a0.d.b.a
        public a0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f384b = bArr;
            return this;
        }

        @Override // ac.a0.d.b.a
        public a0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f383a = str;
            return this;
        }
    }

    @Override // ac.a0.d.b
    public byte[] b() {
        return this.f382b;
    }

    @Override // ac.a0.d.b
    public String c() {
        return this.f381a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d.b) {
            a0.d.b bVar = (a0.d.b) obj;
            if (this.f381a.equals(bVar.c())) {
                if (Arrays.equals(this.f382b, bVar instanceof f ? ((f) bVar).f382b : bVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f381a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f382b);
    }

    public String toString() {
        return "File{filename=" + this.f381a + ", contents=" + Arrays.toString(this.f382b) + "}";
    }

    private f(String str, byte[] bArr) {
        this.f381a = str;
        this.f382b = bArr;
    }
}
