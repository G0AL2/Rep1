package b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f4798c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f4799a;

    /* renamed from: b  reason: collision with root package name */
    private f f4800b;

    public e(String... strArr) {
        this.f4799a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f4799a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f4799a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f4799a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f4799a.size() - 1;
        String str2 = this.f4799a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f4799a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f4799a.get(i10 + 1).equals(str)) {
            return i10 == this.f4799a.size() + (-2) || (i10 == this.f4799a.size() + (-3) && b());
        } else if (z10) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 < this.f4799a.size() - 1) {
                return false;
            }
            return this.f4799a.get(i11).equals(str);
        }
    }

    public f d() {
        return this.f4800b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f4799a.get(i10).equals("**")) {
            return (i10 != this.f4799a.size() - 1 && this.f4799a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4799a.equals(eVar.f4799a)) {
            f fVar = this.f4800b;
            f fVar2 = eVar.f4800b;
            return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
        }
        return false;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f4799a.size()) {
            return false;
        }
        return this.f4799a.get(i10).equals(str) || this.f4799a.get(i10).equals("**") || this.f4799a.get(i10).equals("*");
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f4799a.size() - 1 || this.f4799a.get(i10).equals("**");
    }

    public int hashCode() {
        int hashCode = this.f4799a.hashCode() * 31;
        f fVar = this.f4800b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f4800b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f4799a);
        sb2.append(",resolved=");
        sb2.append(this.f4800b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f4799a = new ArrayList(eVar.f4799a);
        this.f4800b = eVar.f4800b;
    }
}
