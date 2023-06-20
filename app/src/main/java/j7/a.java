package j7;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        Objects.requireNonNull(charSequence, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
