import { makeOptions } from "../facades/fetchUtils"
import { allPhonesURL } from "../facades/settings"
import { handleHttpErrors } from "../facades/fetchUtils";
import React, { useState, useEffect } from "react";



export default function Phones() {
    const [phones, setPhones] = useState([])
    useEffect(() => {
        const options = makeOptions("GET", true);
        fetch(allPhonesURL, options)
            .then(handleHttpErrors)
            .then((data) => {
                console.log(data.all)
                setPhones([...data.all])


            })
    }, [])


    return (
        <div>
            <h1>Her er alle telefonnumre i databasen</h1>
            <table>
                <thead><tr><td>User</td><td>number</td></tr></thead>
                <tbody>{phones.map((p)=> {
                    return (
                    <tr key={p.number}><td>{p.user}</td><td>{p.number}</td></tr>
                    )
                })}</tbody>
            </table>

        </div>
    )
}

