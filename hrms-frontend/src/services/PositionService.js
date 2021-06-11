import axios from 'axios'

export default class PositionService{

    getAll(){
        return axios.get("localhost:8080/api/positions/getall")
    }

    add(position){
        return axios.post("localhost:8080/api/positions/add",position)
    }

}