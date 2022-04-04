crearFilaPersonajes();





async function crearFilaPersonajes() {
    let contenedorTr= document.querySelector("#table-personajes tbody");

    const request = await fetch('getPersonajes', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const personajes = await request.json();
    console.log(personajes);

    for (let p of personajes){
        let tr = document.createElement("tr");

        let tdName= document.createElement("td");
        tdName.innerHTML = p.name;

        let tdEdad= document.createElement("td");
        tdEdad.innerHTML = p.edad;

        let tdPeso= document.createElement("td");
        tdPeso.innerHTML = p.peso;

        let tdHistoria= document.createElement("td");
        tdHistoria.innerHTML = p.historia;

        tr.appendChild(tdName);
        tr.appendChild(tdEdad);
        tr.appendChild(tdPeso);
        tr.appendChild(tdHistoria);

        let tdPeliculas= document.createElement("td");

        for(peli of p.peliculas){
            let a = document.createElement("a");
            a.setAttribute("href", "http://localhost:8080/peliculaInfo/"+peli.id);
            a.innerHTML = peli.titulo;
            tdPeliculas.appendChild(a)
        }

        tr.appendChild(tdPeliculas);

        let tdActionsBtns= document.createElement("td");

        let btnElimnar= document.createElement("a");
        btnElimnar.innerHTML= "<i class=\"material-icons\">&#xE872;</i>";
        btnElimnar.setAttribute("href", "http://localhost:8080/personajeDelete/"+p.id);

        tdActionsBtns.appendChild(btnElimnar);

        tr.appendChild(tdActionsBtns);



        contenedorTr.appendChild(tr);
    }

}