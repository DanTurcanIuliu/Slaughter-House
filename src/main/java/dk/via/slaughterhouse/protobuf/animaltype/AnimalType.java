// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimalType.proto

package dk.via.slaughterhouse.protobuf.animaltype;

public final class AnimalType {
  private AnimalType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020AnimalType.proto\022)dk.via.slaughterhous" +
      "e.protobuf.animaltype\"<\n\027CreateAnimalTyp" +
      "eRequest\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 " +
      "\001(\t\"0\n\030CreateAnimalTypeResponse\022\024\n\014confi" +
      "rmation\030\001 \001(\t\"\"\n\024GetAnimalTypeRequest\022\n\n" +
      "\002id\030\001 \001(\003\"F\n\025GetAnimalTypeResponse\022\n\n\002id" +
      "\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\023\n\013description\030\003 \001(" +
      "\t2\306\002\n\021AnimalTypeService\022\233\001\n\020createAnimal" +
      "Type\022B.dk.via.slaughterhouse.protobuf.an" +
      "imaltype.CreateAnimalTypeRequest\032C.dk.vi" +
      "a.slaughterhouse.protobuf.animaltype.Cre" +
      "ateAnimalTypeResponse\022\222\001\n\rgetAnimalType\022" +
      "?.dk.via.slaughterhouse.protobuf.animalt" +
      "ype.GetAnimalTypeRequest\032@.dk.via.slaugh" +
      "terhouse.protobuf.animaltype.GetAnimalTy" +
      "peResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeRequest_descriptor,
        new java.lang.String[] { "Name", "Description", });
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_descriptor,
        new java.lang.String[] { "Confirmation", });
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animaltype_GetAnimalTypeResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}