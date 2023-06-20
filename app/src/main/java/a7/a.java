package a7;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ReactFindViewUtil.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f80a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<InterfaceC0005a, Set<String>> f81b = new HashMap();

    /* compiled from: ReactFindViewUtil.java */
    /* renamed from: a7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0005a {
        void a(View view, String str);
    }

    /* compiled from: ReactFindViewUtil.java */
    /* loaded from: classes.dex */
    public interface b {
        String a();

        void b(View view);
    }

    public static View a(View view, String str) {
        String b10 = b(view);
        if (b10 == null || !b10.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View a10 = a(viewGroup.getChildAt(i10), str);
                    if (a10 != null) {
                        return a10;
                    }
                }
                return null;
            }
            return null;
        }
        return view;
    }

    private static String b(View view) {
        Object tag = view.getTag(g.f15407l);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void c(View view) {
        String b10 = b(view);
        if (b10 == null) {
            return;
        }
        Iterator<b> it = f80a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (b10.equals(next.a())) {
                next.b(view);
                it.remove();
            }
        }
        for (Map.Entry<InterfaceC0005a, Set<String>> entry : f81b.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(b10)) {
                entry.getKey().a(view, b10);
            }
        }
    }
}
