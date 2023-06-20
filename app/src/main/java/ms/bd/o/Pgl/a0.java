package ms.bd.o.Pgl;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class a0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Method[] declaredMethods;
        Throwable b10 = y0.a().b();
        if (b10 == null) {
            return null;
        }
        StackTraceElement[] stackTrace = b10.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 4; i11++) {
            if (stackTrace[i11] != null && !TextUtils.isEmpty(stackTrace[i11].getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i11].getClassName());
                y0 a10 = y0.a();
                String methodName = stackTrace[i11].getMethodName();
                Objects.requireNonNull(a10);
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(methodName)) {
                    for (Method method : cls.getDeclaredMethods()) {
                        if (method != null && method.getName().equals(methodName)) {
                            arrayList2.add(method);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }
}
