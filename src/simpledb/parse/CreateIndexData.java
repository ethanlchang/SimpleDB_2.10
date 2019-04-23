package simpledb.parse;

/**
 * The parser for the <i>create index</i> statement.
 * @author Edward Sciore
 */
public class CreateIndexData {
   private String idxtype, idxname, tblname, fldname;

//   /**
//    * Saves the table and field names of the specified index.
//    */
//   public CreateIndexData(String idxname, String tblname, String fldname) {
//      this.idxname = idxname;
//      this.tblname = tblname;
//      this.fldname = fldname;
//   }

   /**
    * Saves the index type and the table and field names of the specified index.
    *
    * CS4432 added the index type idxtype
    */
   public CreateIndexData(String idxtype, String idxname, String tblname, String fldname) {
      this.idxtype = idxtype;
      this.idxname = idxname;
      this.tblname = tblname;
      this.fldname = fldname;
   }

   /**
    * Returns the type of the index.
    * @return the type of the index
    */
   public String indexType() {
      return idxtype;
   }

   /**
    * Returns the name of the index.
    * @return the name of the index
    */
   public String indexName() {
      return idxname;
   }
   
   /**
    * Returns the name of the indexed table.
    * @return the name of the indexed table
    */
   public String tableName() {
      return tblname;
   }
   
   /**
    * Returns the name of the indexed field.
    * @return the name of the indexed field
    */
   public String fieldName() {
      return fldname;
   }
}

