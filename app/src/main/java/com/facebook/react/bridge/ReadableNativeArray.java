package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import g6.a;
import java.util.ArrayList;
import java.util.Arrays;

@a
/* loaded from: classes.dex */
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter;
    private Object[] mLocalArray;
    private ReadableType[] mLocalTypeArray;

    /* renamed from: com.facebook.react.bridge.ReadableNativeArray$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
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

    static {
        ReactBridge.staticInit();
        jniPassCounter = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                this.mLocalArray = (Object[]) f6.a.c(importArray());
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] objArr = (Object[]) f6.a.c(importTypeArray());
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    private native Object[] importArray();

    private native Object[] importTypeArray();

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeArray) {
            return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i10) {
        return ((Boolean) getLocalArray()[i10]).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i10) {
        return ((Double) getLocalArray()[i10]).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public Dynamic getDynamic(int i10) {
        return DynamicFromArray.create(this, i10);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i10) {
        return ((Double) getLocalArray()[i10]).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int i10) {
        return (String) getLocalArray()[i10];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int i10) {
        return getLocalTypeArray()[i10];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i10) {
        return getLocalArray()[i10] == null;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return getLocalArray().length;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < size(); i10++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(getBoolean(i10)));
                    break;
                case 3:
                    arrayList.add(Double.valueOf(getDouble(i10)));
                    break;
                case 4:
                    arrayList.add(getString(i10));
                    break;
                case 5:
                    arrayList.add(getMap(i10).toHashMap());
                    break;
                case 6:
                    arrayList.add(getArray(i10).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i10 + ".");
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeArray getArray(int i10) {
        return (ReadableNativeArray) getLocalArray()[i10];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeMap getMap(int i10) {
        return (ReadableNativeMap) getLocalArray()[i10];
    }
}
