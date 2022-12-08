const mongoose = require("mongoose");
mongoose
  .connect("mongodb://127.0.0.1/studentDTU")
  .then(() => console.log("Connected!"));

const Schema = mongoose.Schema;

const InforStudent = new Schema({
  name: String,
  email: String,
  age: Number,
  class: String,
  addresses: {
    type: String,
    ref: "addresses",
  },
});
const AddressStudent = new Schema({
  street: String,
  town: String,
  city: String,
});
const InforStudentModel = mongoose.model("information", InforStudent);
const AddressStudentModel = mongoose.model("addresses", AddressStudent);
InforStudentModel.find({})
  .populate("addresses")
  .then((data) => {
    console.log(data);
  })
  .catch((err) => {
    console.log("Loi roi:", err);
  });

// AddressStudentModel.create(
//   {
//     street: "Cong Tu",
//     town: "Ngu Hanh Son",
//     city: "Da Nang",
//   },
//   {
//     street: "ABC",
//     town: "Ngu Hanh Son",
//     city: "Da Nang",
//   },
//   {
//     street: "DT 605",
//     town: "Hoa Vang",
//     city: "Da Nang",
//   }
// )
//   .then((data) => {
//     console.log("Them thanh cong");
//     console.log("Data", data);
//   })
//   .catch((err) => {
//     console.log("Loi roi:", err);
//   });
//const InforStudentModel = mongoose.model("information", InforStudent);
/*InforStudentModel.create(
  {
    name: "Tran Duc Hoang",
    email: "Hooangtran123@gmail.com",
    age: 20,
    class: "TPM3",
  },
  {
    name: "Hoang Trong Tan",
    email: "Trongtan123@gmail.com",
    age: 20,
    class: "TPM3",
  },
  {
    name: "Dang Van Son",
    email: "dangson123@gmail.com",
    age: 20,
    class: "TPM3",
  }
)
  .then((data) => {
    console.log("Them thanh cong");
    console.log("Data", data);
  })
  .catch((err) => {
    console.log("Loi roi:", err);
  });**/
