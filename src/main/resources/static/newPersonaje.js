
async function registrarPersonaje() {
    let datos= {}

    datos.name = document.querySelector("#name").value;
    datos.edad= document.querySelector("#edad").value;
    datos.peso= document.querySelector("#peso").value;
    datos.historia= document.querySelector("#historia").value;


    const request = await fetch('crearPersonaje', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });


}
