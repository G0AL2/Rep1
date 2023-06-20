package ve;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Appendable.kt */
/* loaded from: classes3.dex */
public class h {
    public static <T> void a(Appendable appendable, T t10, pe.l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.b(t10));
            return;
        }
        if (t10 == null ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }
}
