package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.a;
import com.fyber.inneractive.sdk.protobuf.a;
import com.fyber.inneractive.sdk.protobuf.e;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.q0;
import com.fyber.inneractive.sdk.protobuf.t1;
import com.fyber.inneractive.sdk.protobuf.u;
import com.fyber.inneractive.sdk.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.fyber.inneractive.sdk.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public n1 unknownFields = n1.f19962f;
    public int memoizedSerializedSize = -1;

    /* loaded from: classes2.dex */
    public static class b<T extends GeneratedMessageLite<T, ?>> extends com.fyber.inneractive.sdk.protobuf.b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f19805a;

        public b(T t10) {
            this.f19805a = t10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements u.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public final z.d<?> f19806a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19807b;

        /* renamed from: c  reason: collision with root package name */
        public final t1.b f19808c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f19809d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f19810e;

        public c(z.d<?> dVar, int i10, t1.b bVar, boolean z10, boolean z11) {
            this.f19806a = dVar;
            this.f19807b = i10;
            this.f19808c = bVar;
            this.f19809d = z10;
            this.f19810e = z11;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.a
        public int a() {
            return this.f19807b;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.a
        public boolean b() {
            return this.f19809d;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.a
        public t1.b c() {
            return this.f19808c;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f19807b - ((c) obj).f19807b;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.a
        public t1.c d() {
            return this.f19808c.f20033a;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.a
        public boolean e() {
            return this.f19810e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fyber.inneractive.sdk.protobuf.u.a
        public q0.a a(q0.a aVar, q0 q0Var) {
            return ((a) aVar).a((GeneratedMessageLite) q0Var);
        }
    }

    /* loaded from: classes2.dex */
    public static class d<ContainingType extends q0, Type> extends o<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final ContainingType f19811a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f19812b;

        /* renamed from: c  reason: collision with root package name */
        public final q0 f19813c;

        /* renamed from: d  reason: collision with root package name */
        public final c f19814d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(q0 q0Var, Object obj, q0 q0Var2, c cVar) {
            if (q0Var != 0) {
                if (cVar.c() == t1.b.f20024m && q0Var2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f19811a = q0Var;
                this.f19812b = obj;
                this.f19813c = q0Var2;
                this.f19814d = cVar;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        public Object a(Object obj) {
            c cVar = this.f19814d;
            return cVar.f19808c.f20033a == t1.c.ENUM ? cVar.f19806a.a(((Integer) obj).intValue()) : obj;
        }

        public Object b(Object obj) {
            return this.f19814d.f19808c.f20033a == t1.c.ENUM ? Integer.valueOf(((z.c) obj).a()) : obj;
        }
    }

    /* loaded from: classes2.dex */
    public enum e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType, T> d<MessageType, T> checkIsLite(o<MessageType, T> oVar) {
        oVar.getClass();
        return (d) oVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t10) throws a0 {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        l1 newUninitializedMessageException = t10.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new a0(newUninitializedMessageException.getMessage());
    }

    public static z.a emptyBooleanList() {
        return g.f19868d;
    }

    public static z.b emptyDoubleList() {
        return n.f19957d;
    }

    public static z.f emptyFloatList() {
        return w.f20069d;
    }

    public static z.g emptyIntList() {
        return y.f20075d;
    }

    public static z.i emptyLongList() {
        return h0.f19874d;
    }

    public static <E> z.j<E> emptyProtobufList() {
        return c1.f19846d;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == n1.f19962f) {
            this.unknownFields = n1.c();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (generatedMessageLite == null) {
            try {
                generatedMessageLite = (T) ((GeneratedMessageLite) r1.f19977a.allocateInstance(cls)).getDefaultInstanceForType();
                if (generatedMessageLite != null) {
                    defaultInstanceMap.put(cls, generatedMessageLite);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        return (T) generatedMessageLite;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static z.g mutableCopy(z.g gVar) {
        y yVar = (y) gVar;
        int i10 = yVar.f20077c;
        return yVar.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static Object newMessageInfo(q0 q0Var, String str, Object[] objArr) {
        return new d1(q0Var, str, objArr);
    }

    public static <ContainingType extends q0, Type> d<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, q0 q0Var, z.d<?> dVar, int i10, t1.b bVar, boolean z10, Class cls) {
        return new d<>(containingtype, Collections.emptyList(), q0Var, new c(dVar, i10, bVar, true, z10));
    }

    public static <ContainingType extends q0, Type> d<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, q0 q0Var, z.d<?> dVar, int i10, t1.b bVar, Class cls) {
        return new d<>(containingtype, type, q0Var, new c(dVar, i10, bVar, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream) throws a0 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, q.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer, q qVar) throws a0 {
        return (T) checkMessageInitialized(parseFrom(t10, j.a(byteBuffer, false), qVar));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t10, InputStream inputStream, q qVar) throws a0 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            if ((read & 128) != 0) {
                read &= 127;
                int i10 = 7;
                while (true) {
                    if (i10 < 32) {
                        int read2 = inputStream.read();
                        if (read2 == -1) {
                            throw a0.i();
                        }
                        read |= (read2 & 127) << i10;
                        if ((read2 & 128) == 0) {
                            break;
                        }
                        i10 += 7;
                    } else {
                        while (i10 < 64) {
                            int read3 = inputStream.read();
                            if (read3 == -1) {
                                throw a0.i();
                            }
                            if ((read3 & 128) != 0) {
                                i10 += 7;
                            }
                        }
                        throw a0.e();
                    }
                }
            }
            j a10 = j.a(new a.AbstractC0264a.C0265a(inputStream, read));
            T t11 = (T) parsePartialFrom(t10, a10, qVar);
            try {
                a10.a(0);
                return t11;
            } catch (a0 e10) {
                throw e10;
            }
        } catch (IOException e11) {
            throw new a0(e11.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, j jVar, q qVar) throws a0 {
        T t11 = (T) t10.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
        try {
            b1 b1Var = b1.f19840c;
            b1Var.getClass();
            f1 a10 = b1Var.a(t11.getClass());
            k kVar = jVar.f19913d;
            if (kVar == null) {
                kVar = new k(jVar);
            }
            a10.a(t11, kVar, qVar);
            a10.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof a0) {
                throw ((a0) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(e.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(e.NEW_BUILDER);
    }

    public Object dynamicMethod(e eVar, Object obj) {
        return dynamicMethod(eVar, obj, null);
    }

    public abstract Object dynamicMethod(e eVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b1 b1Var = b1.f19840c;
            b1Var.getClass();
            return b1Var.a(getClass()).b(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final y0<MessageType> getParserForType() {
        return (y0) dynamicMethod(e.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            b1 b1Var = b1.f19840c;
            b1Var.getClass();
            this.memoizedSerializedSize = b1Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        b1 b1Var = b1.f19840c;
        b1Var.getClass();
        int d10 = b1Var.a(getClass()).d(this);
        this.memoizedHashCode = d10;
        return d10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        b1 b1Var = b1.f19840c;
        b1Var.getClass();
        b1Var.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i10, i iVar) {
        ensureUnknownFieldsInitialized();
        n1 n1Var = this.unknownFields;
        n1Var.a();
        if (i10 != 0) {
            n1Var.a(t1.a(i10, 2), iVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(n1 n1Var) {
        this.unknownFields = n1.a(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i10, int i11) {
        ensureUnknownFieldsInitialized();
        n1 n1Var = this.unknownFields;
        n1Var.a();
        if (i10 != 0) {
            n1Var.a(t1.a(i10, 0), Long.valueOf(i11));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i10, j jVar) throws IOException {
        int i11 = t1.f20010a;
        if ((i10 & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.a(i10, jVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.a
    public void setMemoizedSerializedSize(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        s0.a(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q0
    public void writeTo(l lVar) throws IOException {
        b1 b1Var = b1.f19840c;
        b1Var.getClass();
        f1 a10 = b1Var.a(getClass());
        m mVar = lVar.f19947a;
        if (mVar == null) {
            mVar = new m(lVar);
        }
        a10.a((f1) this, (u1) mVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.dynamicMethod(e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        b1 b1Var = b1.f19840c;
        b1Var.getClass();
        boolean a10 = b1Var.a(t10.getClass()).a(t10);
        if (z10) {
            t10.dynamicMethod(e.SET_MEMOIZED_IS_INITIALIZED, a10 ? t10 : null);
        }
        return a10;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.c();
        createBuilder.a(createBuilder.f19803b, messagetype);
        return createBuilder;
    }

    public Object dynamicMethod(e eVar) {
        return dynamicMethod(eVar, null, null);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r0
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(e.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q0
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(e.NEW_BUILDER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q0
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(e.NEW_BUILDER);
        buildertype.c();
        buildertype.a(buildertype.f19803b, this);
        return buildertype;
    }

    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0264a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f19802a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f19803b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f19804c = false;

        public a(MessageType messagetype) {
            this.f19802a = messagetype;
            this.f19803b = (MessageType) messagetype.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
        }

        public final void a(MessageType messagetype, MessageType messagetype2) {
            b1 b1Var = b1.f19840c;
            b1Var.getClass();
            b1Var.a(messagetype.getClass()).a(messagetype, messagetype2);
        }

        public MessageType b() {
            if (this.f19804c) {
                return this.f19803b;
            }
            this.f19803b.makeImmutable();
            this.f19804c = true;
            return this.f19803b;
        }

        public final void c() {
            if (this.f19804c) {
                MessageType messagetype = (MessageType) this.f19803b.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.f19803b;
                b1 b1Var = b1.f19840c;
                b1Var.getClass();
                b1Var.a(messagetype.getClass()).a(messagetype, messagetype2);
                this.f19803b = messagetype;
                this.f19804c = false;
            }
        }

        public Object clone() throws CloneNotSupportedException {
            a newBuilderForType = this.f19802a.newBuilderForType();
            newBuilderForType.a(b());
            return newBuilderForType;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r0
        public q0 getDefaultInstanceForType() {
            return this.f19802a;
        }

        public final MessageType a() {
            MessageType b10 = b();
            if (b10.isInitialized()) {
                return b10;
            }
            throw new l1();
        }

        public BuilderType a(MessageType messagetype) {
            c();
            a(this.f19803b, messagetype);
            return this;
        }

        public BuilderType a(j jVar, q qVar) throws IOException {
            c();
            try {
                b1 b1Var = b1.f19840c;
                MessageType messagetype = this.f19803b;
                b1Var.getClass();
                f1 a10 = b1Var.a(messagetype.getClass());
                MessageType messagetype2 = this.f19803b;
                k kVar = jVar.f19913d;
                if (kVar == null) {
                    kVar = new k(jVar);
                }
                a10.a(messagetype2, kVar, qVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    public static z.i mutableCopy(z.i iVar) {
        h0 h0Var = (h0) iVar;
        int i10 = h0Var.f19876c;
        return h0Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream, q qVar) throws a0 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer) throws a0 {
        return (T) parseFrom(t10, byteBuffer, q.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, i iVar) throws a0 {
        return (T) checkMessageInitialized(parseFrom(t10, iVar, q.a()));
    }

    public static z.f mutableCopy(z.f fVar) {
        w wVar = (w) fVar;
        int i10 = wVar.f20071c;
        return wVar.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, i iVar, q qVar) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, iVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, q.a()));
    }

    public static z.b mutableCopy(z.b bVar) {
        n nVar = (n) bVar;
        int i10 = nVar.f19959c;
        return nVar.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr, q qVar) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, qVar));
    }

    /* loaded from: classes2.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements r0 {
        public u<c> extensions = u.b();

        /* loaded from: classes2.dex */
        public class a {
            public a(ExtendableMessage extendableMessage, boolean z10) {
                Iterator<Map.Entry<c, Object>> f10 = extendableMessage.extensions.f();
                if (f10.hasNext()) {
                    f10.next();
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(j jVar, d<?, ?> dVar, q qVar, int i10) throws IOException {
            parseExtension(jVar, qVar, dVar, t1.a(i10, 2), i10);
        }

        private void mergeMessageSetExtensionFromBytes(i iVar, q qVar, d<?, ?> dVar) throws IOException {
            q0 q0Var = (q0) this.extensions.a((u<c>) dVar.f19814d);
            q0.a builder = q0Var != null ? q0Var.toBuilder() : null;
            if (builder == null) {
                builder = dVar.f19813c.newBuilderForType();
            }
            a.AbstractC0264a abstractC0264a = (a.AbstractC0264a) builder;
            abstractC0264a.getClass();
            try {
                j g10 = iVar.g();
                ((a) abstractC0264a).a(g10, qVar);
                g10.a(0);
                ensureExtensionsAreMutable().c(dVar.f19814d, dVar.b(((a) builder).a()));
            } catch (a0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading " + abstractC0264a.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e11);
            }
        }

        private <MessageType extends q0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, j jVar, q qVar) throws IOException {
            int i10 = 0;
            i iVar = null;
            d<?, ?> dVar = null;
            while (true) {
                int t10 = jVar.t();
                if (t10 == 0) {
                    break;
                } else if (t10 == t1.f20012c) {
                    i10 = jVar.u();
                    if (i10 != 0) {
                        dVar = qVar.f19974a.get(new q.a(messagetype, i10));
                    }
                } else if (t10 == t1.f20013d) {
                    if (i10 != 0 && dVar != null) {
                        eagerlyMergeMessageSetExtension(jVar, dVar, qVar, i10);
                        iVar = null;
                    } else {
                        iVar = jVar.e();
                    }
                } else if (!jVar.e(t10)) {
                    break;
                }
            }
            jVar.a(t1.f20011b);
            if (iVar == null || i10 == 0) {
                return;
            }
            if (dVar != null) {
                mergeMessageSetExtensionFromBytes(iVar, qVar, dVar);
            } else {
                mergeLengthDelimitedField(i10, iVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.j r6, com.fyber.inneractive.sdk.protobuf.q r7, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.d<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.j, com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d, int, int):boolean");
        }

        private void verifyExtensionContainingType(d<MessageType, ?> dVar) {
            if (dVar.f19811a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public u<c> ensureExtensionsAreMutable() {
            u<c> uVar = this.extensions;
            if (uVar.f20051b) {
                this.extensions = uVar.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.e();
        }

        public int extensionsSerializedSize() {
            return this.extensions.d();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.c();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, com.fyber.inneractive.sdk.protobuf.r0
        public /* bridge */ /* synthetic */ q0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(o<MessageType, Type> oVar) {
            d<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            Type type = (Type) this.extensions.a((u<c>) checkIsLite.f19814d);
            if (type == null) {
                return checkIsLite.f19812b;
            }
            c cVar = checkIsLite.f19814d;
            if (cVar.f19809d) {
                if (cVar.f19808c.f20033a == t1.c.ENUM) {
                    ?? r12 = (Type) new ArrayList();
                    for (Object obj : (List) type) {
                        r12.add(checkIsLite.a(obj));
                    }
                    return r12;
                }
                return type;
            }
            return (Type) checkIsLite.a(type);
        }

        public final <Type> int getExtensionCount(o<MessageType, List<Type>> oVar) {
            d<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            u<c> uVar = this.extensions;
            c cVar = checkIsLite.f19814d;
            uVar.getClass();
            if (cVar.b()) {
                Object a10 = uVar.a((u<c>) cVar);
                if (a10 == null) {
                    return 0;
                }
                return ((List) a10).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public final <Type> boolean hasExtension(o<MessageType, Type> oVar) {
            d<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            u<c> uVar = this.extensions;
            c cVar = checkIsLite.f19814d;
            uVar.getClass();
            if (cVar.b()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return uVar.f20050a.get(cVar) != null;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            u<c> uVar = this.extensions;
            if (uVar.f20051b) {
                this.extensions = uVar.clone();
            }
            this.extensions.a(messagetype.extensions);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, com.fyber.inneractive.sdk.protobuf.q0
        public /* bridge */ /* synthetic */ q0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this, false);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this, true);
        }

        public <MessageType extends q0> boolean parseUnknownField(MessageType messagetype, j jVar, q qVar, int i10) throws IOException {
            int i11 = t1.f20010a;
            int i12 = i10 >>> 3;
            return parseExtension(jVar, qVar, qVar.f19974a.get(new q.a(messagetype, i12)), i10, i12);
        }

        public <MessageType extends q0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, j jVar, q qVar, int i10) throws IOException {
            if (i10 == t1.f20010a) {
                mergeMessageSetExtensionFromCodedStream(messagetype, jVar, qVar);
                return true;
            } else if ((i10 & 7) == 2) {
                return parseUnknownField(messagetype, jVar, qVar, i10);
            } else {
                return jVar.e(i10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, com.fyber.inneractive.sdk.protobuf.q0
        public /* bridge */ /* synthetic */ q0.a toBuilder() {
            return super.toBuilder();
        }

        public final <Type> Type getExtension(o<MessageType, List<Type>> oVar, int i10) {
            d<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            u<c> uVar = this.extensions;
            c cVar = checkIsLite.f19814d;
            uVar.getClass();
            if (cVar.b()) {
                Object a10 = uVar.a((u<c>) cVar);
                if (a10 != null) {
                    return (Type) checkIsLite.a(((List) a10).get(i10));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static z.a mutableCopy(z.a aVar) {
        g gVar = (g) aVar;
        int i10 = gVar.f19870c;
        return gVar.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, j.a(inputStream), q.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, q qVar) throws a0 {
        T t11 = (T) t10.dynamicMethod(e.NEW_MUTABLE_INSTANCE);
        try {
            b1 b1Var = b1.f19840c;
            b1Var.getClass();
            f1 a10 = b1Var.a(t11.getClass());
            a10.a(t11, bArr, i10, i10 + i11, new e.a(qVar));
            a10.c(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw a0.i();
        }
    }

    public static <E> z.j<E> mutableCopy(z.j<E> jVar) {
        int size = jVar.size();
        return jVar.b(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream, q qVar) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, j.a(inputStream), qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, j jVar) throws a0 {
        return (T) parseFrom(t10, jVar, q.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, j jVar, q qVar) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, jVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, j jVar) throws a0 {
        return (T) parsePartialFrom(t10, jVar, q.a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, i iVar, q qVar) throws a0 {
        try {
            j g10 = iVar.g();
            T t11 = (T) parsePartialFrom(t10, g10, qVar);
            try {
                g10.a(0);
                return t11;
            } catch (a0 e10) {
                throw e10;
            }
        } catch (a0 e11) {
            throw e11;
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, byte[] bArr, q qVar) throws a0 {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, qVar));
    }
}
