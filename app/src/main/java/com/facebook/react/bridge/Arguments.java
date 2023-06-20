package com.facebook.react.bridge;

import android.os.Bundle;
import android.os.Parcelable;
import g6.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@a
/* loaded from: classes.dex */
public class Arguments {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.bridge.Arguments$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
        } else if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
        } else if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
        } else if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (WritableNativeMap) makeNativeObject);
        } else {
            throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
        }
    }

    public static WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static WritableMap createMap() {
        return new WritableNativeMap();
    }

    public static WritableArray fromArray(Object obj) {
        WritableArray createArray = createArray();
        int i10 = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i10 < length) {
                createArray.pushString(strArr[i10]);
                i10++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i10 < length2) {
                createArray.pushMap(fromBundle(bundleArr[i10]));
                i10++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i10 < length3) {
                createArray.pushInt(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i10 < length4) {
                createArray.pushDouble(fArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i10 < length5) {
                createArray.pushDouble(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i10 < length6) {
                createArray.pushBoolean(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            int length7 = parcelableArr.length;
            while (i10 < length7) {
                Parcelable parcelable = parcelableArr[i10];
                if (parcelable instanceof Bundle) {
                    createArray.pushMap(fromBundle((Bundle) parcelable));
                    i10++;
                } else {
                    throw new IllegalArgumentException("Unexpected array member type " + parcelable.getClass());
                }
            }
        } else {
            throw new IllegalArgumentException("Unknown array type " + obj.getClass());
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                createMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                createMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(str, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                createMap.putMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createMap.putArray(str, fromList((List) obj));
            } else {
                throw new IllegalArgumentException("Could not convert " + obj.getClass());
            }
        }
        return createMap;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    writableNativeArray.pushDouble(((Integer) obj).doubleValue());
                } else if (cls == Double.class) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    writableNativeArray.pushDouble(((Float) obj).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(obj.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.pushMap((WritableNativeMap) obj);
                } else if (cls == WritableNativeArray.class) {
                    writableNativeArray.pushArray((WritableNativeArray) obj);
                } else {
                    throw new RuntimeException("Cannot convert argument of type " + cls);
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromList(List list) {
        WritableArray createArray = createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else if (obj.getClass().isArray()) {
                createArray.pushArray(fromArray(obj));
            } else if (obj instanceof Bundle) {
                createArray.pushMap(fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createArray.pushArray(fromList((List) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Number) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Unknown value type " + obj.getClass());
            }
        }
        return createArray;
    }

    public static WritableNativeArray makeNativeArray(List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list == null) {
            return writableNativeArray;
        }
        for (Object obj : list) {
            Object makeNativeObject = makeNativeObject(obj);
            if (makeNativeObject == null) {
                writableNativeArray.pushNull();
            } else if (makeNativeObject instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) makeNativeObject).booleanValue());
            } else if (makeNativeObject instanceof Integer) {
                writableNativeArray.pushInt(((Integer) makeNativeObject).intValue());
            } else if (makeNativeObject instanceof Double) {
                writableNativeArray.pushDouble(((Double) makeNativeObject).doubleValue());
            } else if (makeNativeObject instanceof String) {
                writableNativeArray.pushString((String) makeNativeObject);
            } else if (makeNativeObject instanceof WritableNativeArray) {
                writableNativeArray.pushArray((WritableNativeArray) makeNativeObject);
            } else if (makeNativeObject instanceof WritableNativeMap) {
                writableNativeArray.pushMap((WritableNativeMap) makeNativeObject);
            } else {
                throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
            }
        }
        return writableNativeArray;
    }

    @a
    public static WritableNativeMap makeNativeMap(Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map == null) {
            return writableNativeMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            addEntry(writableNativeMap, entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    private static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Float) && !(obj instanceof Long) && !(obj instanceof Byte) && !(obj instanceof Short)) {
            if (obj.getClass().isArray()) {
                return makeNativeArray(obj);
            }
            if (obj instanceof List) {
                return makeNativeArray((List) obj);
            }
            if (obj instanceof Map) {
                return makeNativeMap((Map) obj);
            }
            return obj instanceof Bundle ? makeNativeMap((Bundle) obj) : obj;
        }
        return Double.valueOf(((Number) obj).doubleValue());
    }

    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    bundle.putString(nextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return bundle;
    }

    public static ArrayList toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    if (d10 == Math.rint(d10)) {
                        arrayList.add(Integer.valueOf((int) d10));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d10));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(toBundle(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList.add(toList(readableArray.getArray(i10)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }

    @a
    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle == null) {
            return writableNativeMap;
        }
        for (String str : bundle.keySet()) {
            addEntry(writableNativeMap, str, bundle.get(str));
        }
        return writableNativeMap;
    }

    public static <T> WritableNativeArray makeNativeArray(final Object obj) {
        if (obj == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray((List) new AbstractList() { // from class: com.facebook.react.bridge.Arguments.1
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i10) {
                return Array.get(obj, i10);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return Array.getLength(obj);
            }
        });
    }
}
