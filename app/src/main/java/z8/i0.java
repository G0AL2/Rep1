package z8;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import j8.j2;
import java.util.Collections;
import java.util.List;

/* compiled from: TsPayloadReader.java */
/* loaded from: classes2.dex */
public interface i0 {

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f40248a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f40249b;

        public a(String str, int i10, byte[] bArr) {
            this.f40248a = str;
            this.f40249b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f40250a;

        /* renamed from: b  reason: collision with root package name */
        public final String f40251b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f40252c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f40253d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.f40250a = i10;
            this.f40251b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f40252c = unmodifiableList;
            this.f40253d = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public interface c {
        SparseArray<i0> a();

        i0 b(int i10, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f40254a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40255b;

        /* renamed from: c  reason: collision with root package name */
        private final int f40256c;

        /* renamed from: d  reason: collision with root package name */
        private int f40257d;

        /* renamed from: e  reason: collision with root package name */
        private String f40258e;

        public d(int i10, int i11) {
            this(RecyclerView.UNDEFINED_DURATION, i10, i11);
        }

        private void d() {
            if (this.f40257d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f40257d;
            int i11 = i10 == Integer.MIN_VALUE ? this.f40255b : i10 + this.f40256c;
            this.f40257d = i11;
            String str = this.f40254a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11);
            sb2.append(str);
            sb2.append(i11);
            this.f40258e = sb2.toString();
        }

        public String b() {
            d();
            return this.f40258e;
        }

        public int c() {
            d();
            return this.f40257d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i10);
                sb2.append("/");
                str = sb2.toString();
            } else {
                str = "";
            }
            this.f40254a = str;
            this.f40255b = i11;
            this.f40256c = i12;
            this.f40257d = RecyclerView.UNDEFINED_DURATION;
            this.f40258e = "";
        }
    }

    void a(ea.j0 j0Var, p8.k kVar, d dVar);

    void b();

    void c(ea.a0 a0Var, int i10) throws j2;
}
