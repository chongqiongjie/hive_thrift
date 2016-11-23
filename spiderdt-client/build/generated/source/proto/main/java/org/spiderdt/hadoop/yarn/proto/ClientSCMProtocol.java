// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_SCM_protocol.proto

package org.spiderdt.hadoop.yarn.proto;

public final class ClientSCMProtocol {
  private ClientSCMProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf service {@code hadoop.yarn.ClientSCMProtocolService}
   */
  public static abstract class ClientSCMProtocolService
      implements com.google.protobuf.Service {
    protected ClientSCMProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc use(.hadoop.yarn.UseSharedCacheResourceRequestProto) returns (.hadoop.yarn.UseSharedCacheResourceResponseProto);</code>
       */
      public abstract void use(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto request,
          com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto> done);

      /**
       * <code>rpc release(.hadoop.yarn.ReleaseSharedCacheResourceRequestProto) returns (.hadoop.yarn.ReleaseSharedCacheResourceResponseProto);</code>
       */
      public abstract void release(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto request,
          com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new ClientSCMProtocolService() {
        @java.lang.Override
        public  void use(
            com.google.protobuf.RpcController controller,
            org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto request,
            com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto> done) {
          impl.use(controller, request, done);
        }

        @java.lang.Override
        public  void release(
            com.google.protobuf.RpcController controller,
            org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto request,
            com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto> done) {
          impl.release(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.use(controller, (org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto)request);
            case 1:
              return impl.release(controller, (org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto.getDefaultInstance();
            case 1:
              return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto.getDefaultInstance();
            case 1:
              return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc use(.hadoop.yarn.UseSharedCacheResourceRequestProto) returns (.hadoop.yarn.UseSharedCacheResourceResponseProto);</code>
     */
    public abstract void use(
        com.google.protobuf.RpcController controller,
        org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto request,
        com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto> done);

    /**
     * <code>rpc release(.hadoop.yarn.ReleaseSharedCacheResourceRequestProto) returns (.hadoop.yarn.ReleaseSharedCacheResourceResponseProto);</code>
     */
    public abstract void release(
        com.google.protobuf.RpcController controller,
        org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto request,
        com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.spiderdt.hadoop.yarn.proto.ClientSCMProtocol.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.use(controller, (org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto)request,
            com.google.protobuf.RpcUtil.<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.release(controller, (org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto)request,
            com.google.protobuf.RpcUtil.<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto.getDefaultInstance();
        case 1:
          return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto.getDefaultInstance();
        case 1:
          return org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.spiderdt.hadoop.yarn.proto.ClientSCMProtocol.ClientSCMProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void use(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto request,
          com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto.class,
            org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto.getDefaultInstance()));
      }

      public  void release(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto request,
          com.google.protobuf.RpcCallback<org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto.class,
            org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto use(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto release(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto use(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.UseSharedCacheResourceResponseProto.getDefaultInstance());
      }


      public org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto release(
          com.google.protobuf.RpcController controller,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.ReleaseSharedCacheResourceResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.yarn.ClientSCMProtocolService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031client_SCM_protocol.proto\022\013hadoop.yarn" +
      "\032\031yarn_service_protos.proto2\372\001\n\030ClientSC" +
      "MProtocolService\022h\n\003use\022/.hadoop.yarn.Us" +
      "eSharedCacheResourceRequestProto\0320.hadoo" +
      "p.yarn.UseSharedCacheResourceResponsePro" +
      "to\022t\n\007release\0223.hadoop.yarn.ReleaseShare" +
      "dCacheResourceRequestProto\0324.hadoop.yarn" +
      ".ReleaseSharedCacheResourceResponseProto" +
      "B9\n\036org.spiderdt.hadoop.yarn.protoB\021Clie" +
      "ntSCMProtocol\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.getDescriptor(),
        }, assigner);
    org.spiderdt.hadoop.yarn.proto.YarnServiceProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
