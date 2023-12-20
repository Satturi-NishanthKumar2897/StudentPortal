

function fees_1(){

    const xhr = new XMLHttpRequest();

    var fees_id = document.getElementById("fees_id_1").value;
    var rec_no = document.getElementById("rec_no_1").value;
    var late_fee = document.getElementById("late_fee_1").value;
    // var table = document.getElementById("table_1");
    var url = "/fees/" + fees_id ;

    xhr.open("GET", url, true);

    // let resposne = document.getElementById("response");


    xhr.onload = function () {
        if (this.status === 200) {

            obj = JSON.parse(this.responseText);
            // str = "Receipt No:" + rec_no +"<br>"+"Admn No:"+ obj.admn_no+"<br>"+"Student Name:"+obj.student_name+"<br>"+"Father Name:"+obj.father_name+"<br>"+"Class & Sec:"+obj.standard + "<br>"+"Date"+obj.date;
            console.log(obj);
            // table.setAttribute("style", "display:block;")
            document.getElementById('rec_1').innerHTML = rec_no;
            document.getElementById('admn_1').innerHTML = obj.admn_no;
            document.getElementById('stu_1').innerHTML = obj.student_name;
            document.getElementById('fat_1').innerHTML = obj.father_name;
            document.getElementById('sec_1').innerHTML = obj.standard;
            document.getElementById('dat_1').innerHTML = obj.date;
            document.getElementById('lat_1').innerHTML = late_fee;
            var total_fee = parseFloat(late_fee)+obj.fee;
            document.getElementById('tot_1').innerHTML = total_fee;
            document.getElementById('tut_1').innerHTML = obj.fee;
            document.getElementById('rev_1').innerHTML = total_fee;
            document.getElementById('num_1').innerHTML = inWords(total_fee);
            // resposne.innerHTML = str;

        } 
        else {
            console.log("File not found");
        }
    }

    xhr.send();
}

function fees_2(){

    const xhr = new XMLHttpRequest();

    var fees_id = document.getElementById("fees_id_2").value;
    var rec_no = document.getElementById("rec_no_2").value;
    var late_fee = document.getElementById("late_fee_2").value;
    // var table = document.getElementById("table_2");
    var url = "/fees/" + fees_id ;

    xhr.open("GET", url, true);

    // let resposne = document.getElementById("response");


    xhr.onload = function () {
        if (this.status === 200) {

            obj = JSON.parse(this.responseText);
            // str = "Receipt No:" + rec_no +"<br>"+"Admn No:"+ obj.admn_no+"<br>"+"Student Name:"+obj.student_name+"<br>"+"Father Name:"+obj.father_name+"<br>"+"Class & Sec:"+obj.standard + "<br>"+"Date"+obj.date;
            console.log(obj);
            // table.setAttribute("style", "display:block;")
            document.getElementById('rec_2').innerHTML = rec_no;
            document.getElementById('admn_2').innerHTML = obj.admn_no;
            document.getElementById('stu_2').innerHTML = obj.student_name;
            document.getElementById('fat_2').innerHTML = obj.father_name;
            document.getElementById('sec_2').innerHTML = obj.standard;
            document.getElementById('dat_2').innerHTML = obj.date;
            document.getElementById('lat_2').innerHTML = late_fee;
            var total_fee = parseFloat(late_fee)+obj.fee;
            document.getElementById('tot_2').innerHTML = total_fee;
            document.getElementById('tut_2').innerHTML = obj.fee;
            document.getElementById('rev_2').innerHTML = total_fee;
            document.getElementById('num_2').innerHTML = inWords(total_fee);

            // resposne.innerHTML = str;

        } 
        else {
            console.log("File not found");
        }
    }

    xhr.send();
}



var a = ['','one ','two ','three ','four ', 'five ','six ','seven ','eight ','nine ','ten ','eleven ','twelve ','thirteen ','fourteen ','fifteen ','sixteen ','seventeen ','eighteen ','nineteen '];
var b = ['', '', 'twenty','thirty','forty','fifty', 'sixty','seventy','eighty','ninety'];

function inWords (num) {
    if ((num = num.toString()).length > 9) return 'overflow';
    n = ('000000000' + num).substr(-9).match(/^(\d{2})(\d{2})(\d{2})(\d{1})(\d{2})$/);
    if (!n) return; var str = '';
    str += (n[1] != 0) ? (a[Number(n[1])] || b[n[1][0]] + ' ' + a[n[1][1]]) + 'crore ' : '';
    str += (n[2] != 0) ? (a[Number(n[2])] || b[n[2][0]] + ' ' + a[n[2][1]]) + 'lakh ' : '';
    str += (n[3] != 0) ? (a[Number(n[3])] || b[n[3][0]] + ' ' + a[n[3][1]]) + 'thousand ' : '';
    str += (n[4] != 0) ? (a[Number(n[4])] || b[n[4][0]] + ' ' + a[n[4][1]]) + 'hundred ' : '';
    str += (n[5] != 0) ? ((str != '') ? 'and ' : '') + (a[Number(n[5])] || b[n[5][0]] + ' ' + a[n[5][1]]) + 'only ' : '';
    return str;
}

function printData() {
    var menu_1 = document.getElementById("menu_1")
    var menu_2 = document.getElementById("menu_2")
    var print_button = document.getElementById("print_but")

    menu_1.style.display = "none";
    menu_2.style.display = "none";
    print_button.style.display = "none";

    window.print();
    // popup(document.body.innerHTML);

    menu_1.style.display = "block";
    menu_2.style.display = "block";
    print_button.style.display = "block";
}

function popup(data){
    var mywindow = window.open('', 'my div', 'height=1200,width=1000');
    mywindow.document.write('<html><head><title>my div</title>');
    mywindow.document.write('<link rel="stylesheet" href="style.css">');
    mywindow.document.write('</head><body >');
    mywindow.document.write(data);
    mywindow.document.write('</body></html>');

    mywindow.print();
  //  mywindow.close();

    return true;

}
  
