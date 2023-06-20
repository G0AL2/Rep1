package androidx.work;

import androidx.work.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ArrayCreatingInputMerger.kt */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends i {
    private final Object c(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        qe.k.e(newInstance, "newArray");
        return newInstance;
    }

    private final Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        qe.k.c(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        qe.k.e(newInstance, "newArray");
        return newInstance;
    }

    private final Object e(Object obj, Class<?> cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        qe.k.e(newInstance, "newArray");
        return newInstance;
    }

    @Override // androidx.work.i
    public e b(List<e> list) {
        qe.k.f(list, "inputs");
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e eVar : list) {
            Map<String, Object> i10 = eVar.i();
            qe.k.e(i10, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : i10.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                qe.k.e(key, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = e(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (qe.k.a(cls2, cls)) {
                        qe.k.e(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        value = d(obj, value);
                    } else if (qe.k.a(cls2.getComponentType(), cls)) {
                        value = c(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                qe.k.e(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        aVar.d(hashMap);
        e a10 = aVar.a();
        qe.k.e(a10, "output.build()");
        return a10;
    }
}
