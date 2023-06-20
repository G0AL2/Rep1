package com.inmobi.media;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONConverter.java */
/* loaded from: classes3.dex */
public class ij<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25774a = "ij";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f25775b;

    /* renamed from: c  reason: collision with root package name */
    private Map<io, in> f25776c = new HashMap();

    public static void a(boolean z10) {
        f25775b = z10;
    }

    private static boolean b(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            if (obj.getClass() == Integer.TYPE) {
                return ((Integer) obj).intValue() == ((Integer) obj2).intValue();
            } else if (obj.getClass() == Long.TYPE) {
                return ((Long) obj).longValue() == ((Long) obj2).longValue();
            } else if (obj.getClass() == Boolean.TYPE) {
                return ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue();
            } else if (obj.getClass() == Double.TYPE) {
                return ((Double) obj).doubleValue() == ((Double) obj2).doubleValue();
            } else if (obj.getClass() == Byte.TYPE) {
                return ((Byte) obj).byteValue() == ((Byte) obj2).byteValue();
            } else if (obj.getClass() == Short.TYPE) {
                return ((Short) obj).shortValue() == ((Short) obj2).shortValue();
            } else {
                return obj.equals(obj2);
            }
        } else if (obj.getClass() == Integer.class && obj2.getClass() == Long.class) {
            return ((Integer) obj).intValue() == ((Long) obj2).intValue();
        } else if (obj.getClass() == Long.class && obj2.getClass() == Integer.class) {
            return ((Long) obj).intValue() == ((Integer) obj2).intValue();
        } else {
            return obj.equals(obj2);
        }
    }

    public static void a(Object obj, Object obj2) {
        Field[] declaredFields;
        Class<?> cls = obj.getClass();
        if (cls.isAssignableFrom(obj2.getClass())) {
            Object cast = cls.cast(obj2);
            for (Field field : cls.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    field.set(cast, field.get(obj));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    Object obj = jSONArray.get(i10);
                    Object obj2 = jSONArray2.get(i10);
                    if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                        if (!a((JSONObject) obj, (JSONObject) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                        if (!a((JSONArray) obj, (JSONArray) obj2)) {
                            return false;
                        }
                    } else if (!b(obj, obj2)) {
                        return false;
                    }
                } catch (JSONException unused) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object obj;
        Object obj2;
        if (jSONObject.length() == jSONObject2.length()) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    obj = jSONObject.get(next);
                    obj2 = jSONObject2.get(next);
                } catch (JSONException unused) {
                }
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else if (!b(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public ij<T> a(io ioVar, in inVar) {
        this.f25776c.put(ioVar, inVar);
        return this;
    }

    private static boolean a(Class<?> cls) {
        return Integer.TYPE == cls || Integer.class == cls || Boolean.TYPE == cls || Boolean.class == cls || Double.TYPE == cls || Double.class == cls || Float.TYPE == cls || Float.class == cls || Long.TYPE == cls || Long.class == cls || String.class == cls || Byte.TYPE == cls || Byte.class == cls;
    }

    private JSONObject a(Object obj, Class<?> cls) {
        JSONObject jSONObject;
        Field[] declaredFields;
        try {
            cls.getSimpleName();
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || Object.class == superclass) {
                jSONObject = null;
            } else {
                Class<? super Object> superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                jSONObject = a(obj, (Class<?>) superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            for (Field field : cls.getDeclaredFields()) {
                boolean z10 = true;
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(ii.class)) {
                        if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() != type) {
                            z10 = false;
                        }
                        if (!z10) {
                            String name = field.getName();
                            if (Integer.TYPE != type && Integer.class != type) {
                                if (Boolean.TYPE != type && Boolean.class != type) {
                                    if (Double.TYPE != type && Double.class != type) {
                                        if (Float.TYPE != type && Float.class != type) {
                                            if (Long.TYPE != type && Long.class != type) {
                                                if (Byte.TYPE != type && Byte.class != type) {
                                                    if (String.class != type && JSONObject.class != type && JSONArray.class != type) {
                                                        if (Map.class.isAssignableFrom(type)) {
                                                            if (this.f25776c.get(new io(name, cls)) instanceof im) {
                                                                JSONObject jSONObject2 = new JSONObject();
                                                                Object obj2 = field.get(obj);
                                                                if (obj2 != null) {
                                                                    Map map = (Map) obj2;
                                                                    for (Object obj3 : map.keySet()) {
                                                                        Object obj4 = map.get(obj3);
                                                                        if (obj4 != null) {
                                                                            if (!a(obj4.getClass())) {
                                                                                obj4 = a(obj4, obj4.getClass());
                                                                            }
                                                                            jSONObject2.put(obj3.toString(), obj4);
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONObject2);
                                                            } else {
                                                                type.getSimpleName();
                                                            }
                                                        } else if (List.class.isAssignableFrom(type)) {
                                                            if (this.f25776c.get(new io(name, cls)) instanceof il) {
                                                                JSONArray jSONArray = new JSONArray();
                                                                Object obj5 = field.get(obj);
                                                                if (obj5 != null) {
                                                                    for (Object obj6 : (List) obj5) {
                                                                        if (obj6 != null) {
                                                                            if (!a(obj6.getClass())) {
                                                                                obj6 = a(obj6, obj6.getClass());
                                                                            }
                                                                            if (obj6 != null) {
                                                                                jSONArray.put(obj6);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray);
                                                            } else {
                                                                type.getSimpleName();
                                                            }
                                                        } else {
                                                            Object obj7 = field.get(obj);
                                                            if (obj7 != null) {
                                                                jSONObject.put(name, a(obj7, obj7.getClass()));
                                                            } else {
                                                                type.getSimpleName();
                                                            }
                                                        }
                                                    }
                                                    jSONObject.put(name, field.get(obj));
                                                }
                                                jSONObject.put(name, (int) ((Byte) field.get(obj)).byteValue());
                                            }
                                            jSONObject.put(name, ((Long) field.get(obj)).longValue());
                                        }
                                        jSONObject.put(name, ((Float) field.get(obj)).floatValue());
                                    }
                                    jSONObject.put(name, ((Double) field.get(obj)).doubleValue());
                                }
                                jSONObject.put(name, ((Boolean) field.get(obj)).booleanValue());
                            }
                            jSONObject.put(name, ((Integer) field.get(obj)).intValue());
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject a(T t10) {
        return a((Object) t10, t10.getClass());
    }

    public T a(JSONObject jSONObject, Class<T> cls) {
        return cls.cast(a(jSONObject, cls, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object a(JSONObject jSONObject, Class<?> cls, Object obj, Object obj2) {
        Object newInstance;
        Object obj3;
        Class<Double> cls2;
        Field[] fieldArr;
        int i10;
        Class<Float> cls3;
        JSONArray optJSONArray;
        Object obj4;
        Object a10;
        Class<Float> cls4;
        Class<Double> cls5;
        Object a11;
        Object obj5;
        Object valueOf;
        Class<Float> cls6 = Float.class;
        Class<Double> cls7 = Double.class;
        try {
            cls.getSimpleName();
            if (obj2 == null) {
                try {
                    Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                    if (declaredConstructors.length == 0) {
                        newInstance = cls.newInstance();
                    } else {
                        Constructor<?> constructor = declaredConstructors[0];
                        constructor.setAccessible(true);
                        int length = constructor.getParameterTypes().length;
                        if (length == 0) {
                            newInstance = constructor.newInstance(new Object[0]);
                        } else {
                            Object[] objArr = new Object[length];
                            Class<?>[] parameterTypes = constructor.getParameterTypes();
                            int length2 = parameterTypes.length;
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < length2) {
                                Class<?> cls8 = parameterTypes[i11];
                                int i13 = i12 + 1;
                                if (Integer.TYPE != cls8 && Long.TYPE != cls8) {
                                    if (Boolean.TYPE == cls8) {
                                        obj3 = Boolean.FALSE;
                                    } else {
                                        if (Double.TYPE != cls8 && Float.TYPE != cls8) {
                                            obj3 = null;
                                        }
                                        obj3 = Double.valueOf(0.0d);
                                    }
                                    objArr[i12] = obj3;
                                    i11++;
                                    i12 = i13;
                                }
                                obj3 = 0;
                                objArr[i12] = obj3;
                                i11++;
                                i12 = i13;
                            }
                            newInstance = constructor.newInstance(objArr);
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            } else {
                newInstance = obj2;
            }
            if (cls.getSuperclass() != null) {
                Class<? super Object> superclass = cls.getSuperclass();
                superclass.getSimpleName();
                newInstance = a(jSONObject, superclass, obj, newInstance);
            }
            Field[] declaredFields = cls.getDeclaredFields();
            int length3 = declaredFields.length;
            int i14 = 0;
            while (i14 < length3) {
                Field field = declaredFields[i14];
                field.setAccessible(true);
                String name = field.getName();
                if (jSONObject.has(name)) {
                    try {
                        if (!jSONObject.opt(name).equals(null) && !field.isAnnotationPresent(ii.class)) {
                            Class<?> type = field.getType();
                            if (!Modifier.isStatic(field.getModifiers())) {
                                if (Integer.TYPE == type) {
                                    field.setInt(newInstance, jSONObject.getInt(name));
                                } else if (Integer.class == type) {
                                    field.set(newInstance, jSONObject.get(name));
                                } else if (Boolean.TYPE == type) {
                                    field.setBoolean(newInstance, jSONObject.getBoolean(name));
                                } else if (Boolean.class == type) {
                                    field.set(newInstance, Boolean.valueOf(jSONObject.getBoolean(name)));
                                } else if (Double.TYPE == type) {
                                    field.setDouble(newInstance, jSONObject.getDouble(name));
                                } else if (cls7 == type) {
                                    field.set(newInstance, Double.valueOf(jSONObject.getDouble(name)));
                                } else if (Float.TYPE == type) {
                                    field.setFloat(newInstance, (float) jSONObject.getDouble(name));
                                } else if (cls6 == type) {
                                    field.set(newInstance, Float.valueOf((float) jSONObject.getDouble(name)));
                                } else if (Long.TYPE == type) {
                                    field.setLong(newInstance, jSONObject.getLong(name));
                                } else if (Long.class == type) {
                                    field.set(newInstance, Long.valueOf(jSONObject.getLong(name)));
                                } else if (Byte.TYPE != type) {
                                    if (Byte.class == type) {
                                        field.set(newInstance, Byte.valueOf((byte) jSONObject.getInt(name)));
                                    } else if (String.class == type) {
                                        field.set(newInstance, jSONObject.optString(name));
                                    } else if (JSONObject.class == type) {
                                        field.set(newInstance, jSONObject.getJSONObject(name));
                                    } else if (JSONArray.class == type) {
                                        field.set(newInstance, jSONObject.getJSONArray(name));
                                    } else {
                                        if (Map.class.isAssignableFrom(type)) {
                                            fieldArr = declaredFields;
                                            in inVar = this.f25776c.get(new io(name, cls));
                                            if (inVar instanceof im) {
                                                JSONObject optJSONObject = jSONObject.optJSONObject(name);
                                                if (optJSONObject != null) {
                                                    im imVar = (im) inVar;
                                                    Map map = (Map) imVar.f25779b.construct();
                                                    Iterator<String> keys = optJSONObject.keys();
                                                    while (keys.hasNext()) {
                                                        int i15 = length3;
                                                        String next = keys.next();
                                                        Iterator<String> it = keys;
                                                        if (a((Class<?>) imVar.f25778a)) {
                                                            Class<V> cls9 = imVar.f25778a;
                                                            if (Integer.class == cls9) {
                                                                valueOf = Integer.valueOf(optJSONObject.getInt(next));
                                                            } else if (cls7 == cls9) {
                                                                valueOf = Double.valueOf(optJSONObject.getDouble(next));
                                                            } else {
                                                                if (cls6 == cls9) {
                                                                    cls4 = cls6;
                                                                    cls5 = cls7;
                                                                    obj5 = Float.valueOf((float) optJSONObject.getDouble(next));
                                                                } else {
                                                                    cls4 = cls6;
                                                                    cls5 = cls7;
                                                                    if (Long.class != cls9) {
                                                                        if (Byte.class == cls9) {
                                                                            obj5 = Byte.valueOf((byte) optJSONObject.getInt(next));
                                                                        } else {
                                                                            obj5 = optJSONObject.get(next);
                                                                        }
                                                                    } else {
                                                                        obj5 = Long.valueOf(optJSONObject.getLong(next));
                                                                    }
                                                                }
                                                                a11 = cls9.cast(obj5);
                                                            }
                                                            cls5 = cls7;
                                                            Object obj6 = valueOf;
                                                            cls4 = cls6;
                                                            obj5 = obj6;
                                                            a11 = cls9.cast(obj5);
                                                        } else {
                                                            cls4 = cls6;
                                                            cls5 = cls7;
                                                            a11 = a(optJSONObject.getJSONObject(next), (Class<Object>) imVar.f25778a);
                                                        }
                                                        map.put(next, a11);
                                                        length3 = i15;
                                                        keys = it;
                                                        cls6 = cls4;
                                                        cls7 = cls5;
                                                    }
                                                    cls3 = cls6;
                                                    cls2 = cls7;
                                                    i10 = length3;
                                                    field.set(newInstance, map);
                                                } else {
                                                    cls3 = cls6;
                                                    cls2 = cls7;
                                                    i10 = length3;
                                                }
                                            } else {
                                                cls3 = cls6;
                                                cls2 = cls7;
                                                i10 = length3;
                                                type.getSimpleName();
                                            }
                                        } else {
                                            cls3 = cls6;
                                            cls2 = cls7;
                                            fieldArr = declaredFields;
                                            i10 = length3;
                                            if (List.class.isAssignableFrom(type)) {
                                                in inVar2 = this.f25776c.get(new io(name, cls));
                                                if ((inVar2 instanceof il) && (optJSONArray = jSONObject.optJSONArray(name)) != null) {
                                                    il ilVar = (il) inVar2;
                                                    List a12 = ilVar.a();
                                                    for (int i16 = 0; i16 < optJSONArray.length(); i16++) {
                                                        Class<Double> b10 = ilVar.b();
                                                        if (Integer.class == b10) {
                                                            obj4 = Integer.valueOf(optJSONArray.getInt(i16));
                                                        } else {
                                                            Class<Double> cls10 = cls2;
                                                            if (cls10 == b10) {
                                                                obj4 = Double.valueOf(optJSONArray.getDouble(i16));
                                                                cls2 = cls10;
                                                            } else {
                                                                Class<Float> cls11 = cls3;
                                                                if (cls11 == b10) {
                                                                    cls2 = cls10;
                                                                    cls3 = cls11;
                                                                    obj4 = Float.valueOf((float) optJSONArray.getDouble(i16));
                                                                } else {
                                                                    cls2 = cls10;
                                                                    cls3 = cls11;
                                                                    if (Long.class != b10) {
                                                                        if (Byte.class == b10) {
                                                                            obj4 = Byte.valueOf((byte) optJSONArray.getInt(i16));
                                                                        } else {
                                                                            obj4 = optJSONArray.get(i16);
                                                                        }
                                                                    } else {
                                                                        obj4 = Long.valueOf(optJSONArray.getLong(i16));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (a(obj4.getClass())) {
                                                            a10 = ilVar.b().cast(obj4);
                                                        } else {
                                                            a10 = a(optJSONArray.getJSONObject(i16), (Class<Object>) ilVar.b());
                                                        }
                                                        if (a10 != null) {
                                                            a12.add(a10);
                                                        }
                                                    }
                                                    field.set(newInstance, a12);
                                                }
                                            } else {
                                                cls6 = cls3;
                                                JSONObject optJSONObject2 = jSONObject.optJSONObject(name);
                                                if (optJSONObject2 != null) {
                                                    try {
                                                        field.set(newInstance, a(optJSONObject2, type, newInstance, null));
                                                    } catch (Exception unused2) {
                                                        return null;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                                i14++;
                                                declaredFields = fieldArr;
                                                length3 = i10;
                                                cls7 = cls2;
                                            }
                                        }
                                        cls6 = cls3;
                                        i14++;
                                        declaredFields = fieldArr;
                                        length3 = i10;
                                        cls7 = cls2;
                                    }
                                } else {
                                    field.setByte(newInstance, (byte) jSONObject.getInt(name));
                                }
                            }
                        }
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                cls2 = cls7;
                fieldArr = declaredFields;
                i10 = length3;
                i14++;
                declaredFields = fieldArr;
                length3 = i10;
                cls7 = cls2;
            }
            return newInstance;
        } catch (Exception unused4) {
            return null;
        }
    }
}
