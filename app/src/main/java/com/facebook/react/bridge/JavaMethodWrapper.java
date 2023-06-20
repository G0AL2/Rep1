package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.b;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import j4.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k4.a;

/* loaded from: classes.dex */
public class JavaMethodWrapper implements NativeModule.NativeMethod {
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Boolean.valueOf(readableArray.getBoolean(i10));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Double.valueOf(readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Float.valueOf((float) readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.4
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Integer.valueOf((int) readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.5
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return readableArray.getString(i10);
        }
    };
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return readableArray.getArray(i10);
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.7
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return DynamicFromArray.create(readableArray, i10);
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.8
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return readableArray.getMap(i10);
        }
    };
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.9
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            if (readableArray.isNull(i10)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.10
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i10), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i10 + 1));
        }
    };
    private static final boolean DEBUG = c.a().a(a.f33145b);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class ArgumentExtractor<T> {
        private ArgumentExtractor() {
        }

        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z10) {
        this.mType = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z10) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (length <= 0 || parameterTypes[length - 1] != Promise.class) {
        } else {
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        int i10 = 0;
        while (i10 < clsArr.length) {
            Class cls = clsArr[i10];
            if (cls != Boolean.class && cls != Boolean.TYPE) {
                if (cls != Integer.class && cls != Integer.TYPE) {
                    if (cls != Double.class && cls != Double.TYPE) {
                        if (cls != Float.class && cls != Float.TYPE) {
                            if (cls == String.class) {
                                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_STRING;
                            } else if (cls == Callback.class) {
                                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_CALLBACK;
                            } else if (cls == Promise.class) {
                                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_PROMISE;
                                f6.a.b(i10 == clsArr.length - 1, "Promise must be used as last parameter only");
                            } else if (cls == ReadableMap.class) {
                                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_MAP;
                            } else if (cls == ReadableArray.class) {
                                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_ARRAY;
                            } else if (cls == Dynamic.class) {
                                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_DYNAMIC;
                            } else {
                                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                            }
                        } else {
                            argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_FLOAT;
                        }
                    } else {
                        argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_DOUBLE;
                    }
                } else {
                    argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_INTEGER;
                }
            } else {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_BOOLEAN;
            }
            i10 += argumentExtractorArr[i10].getJSArgumentsNeeded();
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z10) {
        StringBuilder sb2 = new StringBuilder(clsArr.length + 2);
        if (z10) {
            sb2.append(returnTypeToChar(method.getReturnType()));
            sb2.append('.');
        } else {
            sb2.append("v.");
        }
        int i10 = 0;
        while (i10 < clsArr.length) {
            Class cls = clsArr[i10];
            if (cls == Promise.class) {
                f6.a.b(i10 == clsArr.length - 1, "Promise must be used as last parameter only");
            }
            sb2.append(paramTypeToChar(cls));
            i10++;
        }
        return sb2.toString();
    }

    private int calculateJSArgumentsNeeded() {
        int i10 = 0;
        for (ArgumentExtractor argumentExtractor : (ArgumentExtractor[]) f6.a.c(this.mArgumentExtractors)) {
            i10 += argumentExtractor.getJSArgumentsNeeded();
        }
        return i10;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    private String getAffectedRange(int i10, int i11) {
        if (i11 > 1) {
            return "" + i10 + Constants.FILENAME_SEQUENCE_SEPARATOR + ((i10 + i11) - 1);
        }
        return "" + i10;
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private void processArguments() {
        if (this.mArgumentsProcessed) {
            return;
        }
        b.AbstractC0223b a10 = b.a(0L, "processArguments");
        a10.b("method", this.mModuleWrapper.getName() + "." + this.mMethod.getName()).c();
        try {
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            b.b(0L).c();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) f6.a.c(this.mSignature);
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public String getType() {
        return this.mType;
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        b.a(0L, "callJavaModuleMethod").b("method", str).c();
        int i10 = 0;
        if (DEBUG) {
            c.a().b(a.f33145b, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments != null && this.mArgumentExtractors != null) {
                if (this.mJSArgumentsNeeded != readableArray.size()) {
                    throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
                }
                int i11 = 0;
                while (true) {
                    try {
                        ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
                        if (i10 < argumentExtractorArr.length) {
                            this.mArguments[i10] = argumentExtractorArr[i10].extractArgument(jSInstance, readableArray, i11);
                            i11 += this.mArgumentExtractors[i10].getJSArgumentsNeeded();
                            i10++;
                        } else {
                            try {
                                this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                                return;
                            } catch (IllegalAccessException e10) {
                                throw new RuntimeException("Could not invoke " + str, e10);
                            } catch (IllegalArgumentException e11) {
                                throw new RuntimeException("Could not invoke " + str, e11);
                            } catch (InvocationTargetException e12) {
                                if (e12.getCause() instanceof RuntimeException) {
                                    throw ((RuntimeException) e12.getCause());
                                }
                                throw new RuntimeException("Could not invoke " + str, e12);
                            }
                        }
                    } catch (UnexpectedNativeTypeException e13) {
                        throw new NativeArgumentsParseException(e13.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i11, this.mArgumentExtractors[i10].getJSArgumentsNeeded()) + ")", e13);
                    }
                }
            } else {
                throw new Error("processArguments failed");
            }
        } finally {
            b.b(0L).c();
        }
    }
}
