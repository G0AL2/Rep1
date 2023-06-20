package f1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public View f30063b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f30062a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f30064c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f30063b == sVar.f30063b && this.f30062a.equals(sVar.f30062a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f30063b.hashCode() * 31) + this.f30062a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f30063b + "\n") + "    values:";
        for (String str2 : this.f30062a.keySet()) {
            str = str + "    " + str2 + ": " + this.f30062a.get(str2) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f30063b = view;
    }
}
