package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@RetainForClient
@KeepForSdk
/* loaded from: classes2.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final T zza;

    private ObjectWrapper(T t10) {
        this.zza = t10;
    }

    @KeepForSdk
    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            Preconditions.checkNotNull(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Unexpected number of IObjectWrapper declared fields: ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    @KeepForSdk
    public static <T> IObjectWrapper wrap(T t10) {
        return new ObjectWrapper(t10);
    }
}
